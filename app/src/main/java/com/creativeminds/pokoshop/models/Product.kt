import com.creativeminds.pokoshop.ProductCategory
import com.creativeminds.pokoshop.ProductImages
import com.creativeminds.pokoshop.models.ProductVariant

class Product() {
    var category: ProductCategory? = null
    var brand: String = ""
    var sale: Boolean = false
    var featured: Boolean = false
    var pictures: List<ProductImages> = emptyList()
    var quantity: Int = 0
    var variants: List<ProductVariant> = emptyList()
    var description: String = ""
    var name: String? = null
    var id: Int = 0

    var price: Double = 0.0
}
