package com.bateman.msu.hw4courtcounter

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.collections.plusAssign
import kotlin.inc

private const val TAG = "CourtCounterViewModel"


class CourtCounterViewModel: ViewModel() {

    init {

        Log.d(TAG, "ViewModel instance created")

    }

    var scoreTeamA = 0
    var scoreTeamB = 0

    fun plusOneTeamA(){
        scoreTeamA++

    }
    fun plusTwoTeamA(){
        scoreTeamA += 2

    }
    fun plusThreeTeamA(){
        scoreTeamA += 3

    }
    fun plusOneTeamB(){
        scoreTeamB += 1

    }
    fun plusTwoTeamB(){
        scoreTeamB += 2

    }
    fun plusThreeTeamB(){
        scoreTeamB += 3

    }
    fun scoreRest(){
        scoreTeamA = 0
        scoreTeamB = 0
    }

}