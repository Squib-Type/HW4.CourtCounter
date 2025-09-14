package com.bateman.msu.hw4courtcounter


import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.bateman.msu.hw4courtcounter.databinding.ActivityMainBinding
import kotlin.getValue


private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    // var scoreTeamA = 0
    // var scoreTeamB = 0
    private val courtCounterViewModel: CourtCounterViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d(TAG, "onCreate(Bundle) called")

        displayForTeamA(courtCounterViewModel.scoreTeamA)
        displayForTeamB(courtCounterViewModel.scoreTeamB)

    }

    /**
     * Increase the score for Team A by 1 point.
     */
    fun addOneForTeamA(v: View?) {
        // scoreTeamA++
        // displayForTeamA(scoreTeamA)
        courtCounterViewModel.plusOneTeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    fun addTwoForTeamA(v: View?) {
        // scoreTeamA += 2
        // displayForTeamA(scoreTeamA)
        courtCounterViewModel.plusTwoTeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team A by 3 points.
     */
    fun addThreeForTeamA(v: View?) {
        // scoreTeamA += 3
        // displayForTeamA(scoreTeamA)
        courtCounterViewModel.plusThreeTeamA()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    fun addOneForTeamB(v: View?) {
        // scoreTeamB++
        // displayForTeamB(scoreTeamB)
        courtCounterViewModel.plusOneTeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    fun addTwoForTeamB(v: View?) {
        // scoreTeamB += 2
        // displayForTeamB(scoreTeamB)
        courtCounterViewModel.plusTwoTeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Increase the score for Team B by 3 points.
     */
    fun addThreeForTeamB(v: View?) {
        // scoreTeamB += 3
        // displayForTeamB(scoreTeamB)
        courtCounterViewModel.plusThreeTeamB()
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Resets the score for both teams back to 0.
     */
    fun resetScore(v: View?) {
        // scoreTeamA = 0
        // scoreTeamB = 0
        // displayForTeamA(scoreTeamA)
        // displayForTeamB(scoreTeamB)
        courtCounterViewModel.scoreRest()
        displayForTeamA(courtCounterViewModel.scoreTeamA)
        displayForTeamB(courtCounterViewModel.scoreTeamB)
    }

    /**
     * Displays the given score for Team A.
     */

    fun displayForTeamA(score: Int) {
        val scoreView = binding.teamAScore
        scoreView.text = score.toString()
    }

    /**
     * Displays the given score for Team B.
     */
    fun displayForTeamB(score: Int) {
        val scoreView = binding.teamBScore
        scoreView.text = score.toString()
    }
}