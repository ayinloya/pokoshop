package com.creativeminds.pokoshop

import Product
import com.creativeminds.pokoshop.models.ProductVariant
import org.junit.Test
import org.junit.Before



class ProductModelTest {
    private var mProduct: Product? = null

    @Before
    fun setUp() {
        mProduct = Product()
    }
    @Test
    fun createNewProduct() {
        val productVariants: List<ProductVariant> = listOf(ProductVariant())

        mProduct?.id = 1
        mProduct?.quantity = 100
        mProduct?.pictures = listOf(ProductImages())
        mProduct?.name = ""
        mProduct?.featured = false
        mProduct?.sale = true
        mProduct?.brand = ""
        mProduct?.price = 10.0
        mProduct?.category = ProductCategory()
        mProduct?.description = ""
        mProduct?.variants = productVariants
    }
}