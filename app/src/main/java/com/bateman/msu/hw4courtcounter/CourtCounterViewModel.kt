package com.bateman.msu.hw4courtcounter

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import kotlin.collections.plusAssign
import kotlin.inc

private const val TAG = "CourtCounterViewModel"

const val CURRENT_SCORE_A = "CURRENT_SCORE_A"
const val CURRENT_SCORE_B = "CURRENT_SCORE_B"

class CourtCounterViewModel(private val savedStateHandle: SavedStateHandle): ViewModel() {

    init {

        Log.d(TAG, "ViewModel instance created")

    }

    var scoreTeamA
        get() = savedStateHandle.get(CURRENT_SCORE_A)?:0
        set(value) = savedStateHandle.set(CURRENT_SCORE_A, value)
    var scoreTeamB
        get() = savedStateHandle.get(CURRENT_SCORE_B)?:0
        set(value) = savedStateHandle.set(CURRENT_SCORE_B, value)

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