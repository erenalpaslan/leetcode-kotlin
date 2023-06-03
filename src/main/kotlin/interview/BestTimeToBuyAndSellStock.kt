package interview

import java.util.Stack

/**
 * Created by erenalpaslan on 25.03.2023
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return  0
 */
object BestTimeToBuyAndSellStock {
    fun maxProfit(prices: IntArray): Int {
        var highPair: Pair<Int, Int>? = null
        var lowPair: Pair<Int, Int>? = null
        prices.forEachIndexed { index, i ->

            if (lowPair == null) {
                lowPair = index to i
            } else if (highPair == null && i <= lowPair!!.second) {
                lowPair = index to i
            } else if (i <= lowPair!!.second && highPair != null && index < highPair!!.first) {
                lowPair = index to i
            } else if (highPair == null) {
                highPair = index to i
            } else if (i >= highPair!!.second && index >= lowPair!!.first) {
                highPair = index to i
            }

        }
        val result = (highPair?.second ?: 0) - (lowPair?.second ?: 0)
        return if (result < 0) 0 else result
    }
}