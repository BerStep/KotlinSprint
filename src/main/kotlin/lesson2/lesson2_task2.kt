package org.example.lesson2

fun main() {
    val staff = 50
    val salaryStaff = 30000
    val interns = 30
    val salaryInterns = 20000
    val allStaff = staff + interns
    val paymentsStaff = staff * salaryStaff
    val paymentsInterns = interns * salaryInterns
    val allPayments = paymentsStaff + paymentsInterns
    val avgSalary = allPayments / allStaff
    println(paymentsStaff)
    println(allPayments)
    println(avgSalary)
}

