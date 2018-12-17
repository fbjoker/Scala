package com.alex.demo1.demo4

class BankAccount {

  private var balance:Double=0

  private def    setbalance(x:Double)={
    balance= x
  }
  def getbalance():Double={

    return  balance
  }

  def deposit(x:Double)={

    balance+=x

  }

  def withdraw(x:Double)={

    if (x<balance)    balance-=x

  }


}


object  TestAccount{
  def main(args: Array[String]): Unit = {
    val account = new BankAccount()

    account.deposit(100)
    account.withdraw(30)

    println(account.getbalance())

  }

}
