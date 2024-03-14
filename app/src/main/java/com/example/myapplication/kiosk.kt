package com.example.myapplication


open class Order {
   open fun order(pick:Int): String {
       var one = Coffee()
       var two = Bread()
       var three = Drink()

       val list2 = "------menu------\n1.커피\n2.빵\n3.음료\n0.끝내기"
       var result: String
       println(list2)
       var pick = readLine()!!.toInt()

           when (pick) {
               1 -> result = (one.order1(pick.toString()))
               2 -> result = (two.order2(pick.toString()))
               3 -> result = (three.order3(pick.toString()))

               else -> result = println("").toString()
           }
           return result


   }
}

class Coffee {
    fun order1(pick:String):String{
        println("커피 메뉴")
        println("1.아메리카노\t2500")
        println("2.카페라떼\t3500")
        println("3.카라멜마끼야또\t4500")
        println("4.카페모카\t4500")

        var pick = readLine()!!.toInt()
        var detail = Cdetail()
        var result:String

        when(pick){
            1 -> result = (detail.menu1()).toString()
            2 -> result = (detail.menu2()).toString()
            3 -> result = (detail.menu3()).toString()
            4 -> result = (detail.menu4()).toString()
            else -> result = println("잘못 입력하였습니다").toString()

        }
        return result
    }
}

class Cdetail {
    fun menu1() {
        var price = 2500
        var name = "아메리카노"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu2() {
        var price = 3500
        var name = "카페라떼"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu3() {
        var price = 4500
        var name = "카라멜마끼야또"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu4() {
        var price = 4500
        var name = "카페모카"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고가격은:${price}입니다. ")
    }
}

class Bread {
    fun order2(pick:String):String{
        println("베이커리")
        println("1.크로플\t3500")
        println("2.머핀\t3600")
        println("3.스콘\t3000")
        println("4.마들렌\t2500")

        var pick = readLine()!!.toInt()
        var detail = Bdetail()
        var result:String

        when(pick){
            1 -> result = (detail.menu1()).toString()
            2 -> result = (detail.menu2()).toString()
            3 -> result = (detail.menu3()).toString()
            4 -> result = (detail.menu4()).toString()
            else -> result = println("잘못 입력하였습니다").toString()

        }
        return result
    }
}

class Bdetail {
    fun menu1() {
        var price = 3500
        var name = "크로플"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu2() {
        var price = 3600
        var name = "머핀"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고  가격은:${price}입니다. ")
    }
    fun menu3() {
        var price = 3000
        var name = "스콘"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu4() {
        var price = 2500
        var name = "마들렌"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
}

class Drink {
    fun order3(pick:String):String{
        println("커피 메뉴")
        println("1.스무디\t5500")
        println("2.에이드\t4500")
        println("3.미숫가루\t3000")
        println("4.티\t5500")

        var pick = readLine()!!.toInt()
        var detail = Ddetail()
        var result:String

        when(pick){
            1 -> result = (detail.menu1()).toString()
            2 -> result = (detail.menu2()).toString()
            3 -> result = (detail.menu3()).toString()
            4 -> result = (detail.menu4()).toString()
            else -> result = println("잘못 입력하였습니다").toString()

        }
        return result
    }
}

class Ddetail {
    fun menu1() {
        var price = 5500
        var name = "스무디"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu2() {
        var price = 4500
        var name = "에이드"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu3() {
        var price = 3000
        var name = "미숫가루"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
    fun menu4() {
        var price = 5500
        var name = "티"
        println(name)
        println("가격 : ${price}")
//        println("수량을 입력해 주세요")
//        var number = readLine()!!.toInt()
        println("주문한 메뉴는 ${name}이고 가격은:${price}입니다. ")
    }
}

//open class Op{
//    open  fun op(){
//        val orderlist = Array<Int>(10,{0})
//        var total = 0
//    }
//}
//
// class Cancel{
//    fun Lists(orderlist:String){
//
//        var total = 0
//        val orderlist = Array<Int>(10,{0})
//        println("---주문한 메뉴 리스트---")
//        for (i in orderlist){
//            println("$i")
//        }
//        println("취소할 메뉴")
//    }
//}

//class pay{
//    fun pays(){
//        println("결제할 금액:" total + "원")
//        println("지불할 금액: ")
//        var money = readLine()!!.toInt()
//        if (money < total){
//            println("잔돈이 부족합니다.")
//            continue
//        }
//        else{
//            println("잔돈은 ${money-total}원 입나다")
//            var total = 0
//            for(i in 1..10 ){
//                orderlist[i] = ""
//            }
//        }
//
//    }
//}





fun main(){



    val list = "------cafe------\n1.주문하기\n2.취소하기\n3.결제하기\n0.끝내기"

    var ob = Order()

    while (true){

        println(list)
        var choice = readLine()!!.toInt()
        when(choice) {
            1 -> println("${ob.order(choice)}")
            2 -> println("취소하기")
            3 -> println("결제하기")
            0 -> break
            else -> println("다시 입력해주세요")
        }

    }
}