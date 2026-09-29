package com.example.ui.components

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.unit.dp
import com.example.model.Department
import com.example.model.ProductCategory
import com.example.ui.theme.DeepIndigo

@Composable
fun DepartmentTabs(
    selectedDepartment: Department,
    onDepartmentSelected: (Department) -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(scrollState)
            .padding(horizontal = 16.dp, vertical = 6.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        listOf(
            Department.ALL,
            Department.ELECTRONICS,
            Department.FASHION
        ).forEach { dept ->
            val isSelected = dept == selectedDepartment
            FilterChip(
                selected = isSelected,
                onClick = { onDepartmentSelected(dept) },
                label = { Text(dept.title) },
                colors = FilterChipDefaults.filterChipColors(
                    selectedContainerColor = DeepIndigo,
                    selectedLabelColor = MaterialTheme.colorScheme.onPrimary
                ),
                modifier = Modifier.testTag("dept_chip_${dept.name}")
            )
        }
    }
}

@Composable
fun CategoryChips(
    selectedCategory: ProductCategory,
    selectedDepartment: Department,
    onCategorySelected: (ProductCategory) -> Unit,
    modifier: Modifier = Modifier
) {
    val scrollState = rememberScrollState()
    val availableCategories = when (selectedDepartment) {
        Department.ALL -> ProductCategory.entries.toList()
        Department.ELECTRONICS -> listOf(ProductCategory.ALL) + ProductCategory.entries.filter { it.department == Department.ELECTRONICS }
        Department.FASHION -> listOf(ProductCategory.ALL) + ProductCategory.entries.filter { it.department == Department.FASHION }
        else -> ProductCategory.entries.toList()
    }

    Row(
        modifier = modifier
            .fillMaxWidth()
            .horizontalScroll(scrollState)
            .padding(horizontal = 16.dp, vertical = 4.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        availableCategories.forEach { category ->
            val isSelected = category == selectedCategory
            FilterChip(
                selected = isSelected,
                onClick = { onCategorySelected(category) },
                label = { Text(category.label) },
                modifier = Modifier.testTag("category_chip_${category.name}")
            )
        }
    }
}
