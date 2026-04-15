package uts_00000138599_RadityaAgra

import java.util.Scanner

//No B1
enum class OrderStatus {
    WAITING_LIST,
    COOKING,
    DELIVERED
}

data class Customer(
    val name: String,
    val phone: String,
    val deliveryAddress: String
)

//No B2
interface IBillable {
    fun calculateSubtotal(quantity: Int): Double
    fun printMenuDetails(quantity: Int)
}

abstract class CateringMenu(
    val name: String,
    menuCode: String,
    basePrice: Double
) : IBillable {

    var menuCode: String = menuCode
        set(value) {
            field = value.uppercase()
        }
        get() = "UMN-$field"

    var basePrice: Double = basePrice
        set(value) {
            if (value >= 0) {
                field = value
            } else {
                println("[Error] HArga Invalid!")
            }
        }

    abstract override fun calculateSubtotal(quantity: Int): Double
    abstract override fun printMenuDetails(quantity: Int)
}

//No B3

class FoodMenu(
    name: String,
    menuCode: String,
    basePrice: Double
) : CateringMenu(name, menuCode, basePrice) {

    val packagingFee: Double = 3000.0

    override fun calculateSubtotal(quantity: Int): Double {
        return (basePrice + packagingFee) * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        println("[FOOD] $menuCode - $name")
        println("Qty: $quantity porsi | Subtotal: Rp $subtotal")
    }
}

class DrinkMenu(
    name: String,
    menuCode: String,
    basePrice: Double,
    val isLargeSize: Boolean
) : CateringMenu(name, menuCode, basePrice) {

    override fun calculateSubtotal(quantity: Int): Double {
        val price = if (isLargeSize) basePrice + 5000 else basePrice
        return price * quantity
    }

    override fun printMenuDetails(quantity: Int) {
        val subtotal = calculateSubtotal(quantity)
        val size = if (isLargeSize) "Large" else "Regular"

        println("[DRINK] $menuCode - $name ($size)")
        println("Qty: $quantity cup | Subtotal: Rp $subtotal")
    }
}

//No B4

class CateringOrder(val customer: Customer) {

    var status: OrderStatus = OrderStatus.WAITING_LIST
    private val orderItems = mutableListOf<Pair<CateringMenu, Int>>()

    fun addMenuToOrder(menu: CateringMenu, qty: Int) {
        orderItems.add(Pair(menu, qty))
        println("Order Berhasil Ditambah!")
    }

    fun printInvoice() {
        println("\n================ INVOICE ================")
        println("Pelanggan: ${customer.name} (${customer.phone})")
        println("Alamat Pengiriman: ${customer.deliveryAddress}")
        println("Status Pesanan: $status\n")

        var total = 0.0

        for ((index, pair) in orderItems.withIndex()) {
            val (menu, qty) = pair
            print("${index + 1}. ")
            menu.printMenuDetails(qty)
            total += menu.calculateSubtotal(qty)
        }

        println("-----------------------------------------")
        println("GRAND TOTAL: Rp $total")
        println("=========================================")
    }
}

//Bagian C

fun main() {

    val scanner = Scanner(System.`in`)

    println("=== UMN CATERING MANAGER SYSTEM ===")

    //Fase ke 1
    println("[Database Setup] Adding Nasi Goreng Spesial...")
    val nasi = FoodMenu("Nasi Goreng Spesial", "nsg01", -15000.0)
    nasi.basePrice = -15000.0 // error
    nasi.basePrice = 25000.0

    val ayam = FoodMenu("Ayam Bakar Madu", "aym02", 35000.0)
    val teh = DrinkMenu("Es Teh Lemon", "lem01", 8000.0, true)

    val menuList = listOf<CateringMenu>(nasi, ayam, teh)

    //Fase Ke 2
    println("\n--- INPUT DATA PELANGGAN ---")
    print("Masukkan Nama Pelanggan: ")
    val name = scanner.nextLine()

    print("Masukkan Nomor HP: ")
    val phone = scanner.nextLine()

    print("Masukkan Alamat Pengiriman: ")
    val address = scanner.nextLine()

    val customer = Customer(name, phone, address)
    val order = CateringOrder(customer)

    //Fase ke 3
    while (true) {
        println("\n--- KATALOG MENU ---")
        for (i in menuList.indices) {
            println("${i + 1}. ${menuList[i].name}")
        }
        println("0. [SELESAI & CHECKOUT]")

        print("Pilih Nomor Menu: ")
        val choice = scanner.nextInt()

        if (choice == 0) break

        if (choice in 1..menuList.size) {
            print("Masukkan Jumlah Pesanan: ")
            val qty = scanner.nextInt()

            order.addMenuToOrder(menuList[choice - 1], qty)
        } else {
            println("Pilihan Invalid!")
        }
    }

    //Fase ke 4
    order.status = OrderStatus.COOKING
    order.printInvoice()
}