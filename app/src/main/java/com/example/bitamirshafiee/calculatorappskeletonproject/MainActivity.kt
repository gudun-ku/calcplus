package com.example.bitamirshafiee.calculatorappskeletonproject

import android.graphics.Path
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

    var expression: String = ""
    var numberOne : Float = 0.0F
    var numberTwo : Float = 0.0F
    var operationType: OperationType = OperationType.NOP

    enum class OperationType {
        NOP, ADDITION, SUBSTRACTION, MULTIPLICATION, DIVISION
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun operationFunction(view: View) {
        when(view.id) {
            R.id.button_one -> {
                expression += "1"
                editDisplay.setText(expression)
            }
            R.id.button_two -> {
                expression += "2"
                editDisplay.setText(expression)
            }
            R.id.button_three -> {
                expression += "3"
                editDisplay.setText(expression)
            }
            R.id.button_four -> {
                expression += "4"
                editDisplay.setText(expression)
            }
            R.id.button_five -> {
                expression += "5"
                editDisplay.setText(expression)
            }
            R.id.button_six -> {
                expression += "6"
                editDisplay.setText(expression)
            }
            R.id.button_seven -> {
                expression += "7"
                editDisplay.setText(expression)
            }
            R.id.button_eight -> {
                expression += "8"
                editDisplay.setText(expression)
            }
            R.id.button_nine -> {
                expression += "9"
                editDisplay.setText(expression)
            }
            R.id.button_zero-> {
                expression += "0"
                editDisplay.setText(expression)
            }

            R.id.button_clear -> {
                expression = "";
                editDisplay.setText(expression);
            }
            R.id.button_dot -> {
                expression += "."
                editDisplay.setText(expression)
            }
            R.id.button_plus -> {
                if (expression.isNullOrBlank()) {
                    editDisplay.setText("");
                } else {
                    numberOne = expression.toFloat()
                    expression = ""
                    editDisplay.setText(expression)
                    operationType = OperationType.ADDITION

                }
            }
            R.id.button_divide -> {
                if (expression.isNullOrBlank()) {
                    editDisplay.setText("");
                } else {
                    numberOne = expression.toFloat()
                    expression = ""
                    editDisplay.setText(expression)
                    operationType = OperationType.DIVISION
                }
            }
            R.id.button_minus -> {
                if (expression.isNullOrBlank()) {
                    editDisplay.setText("");
                } else {
                    numberOne = expression.toFloat()
                    expression = ""
                    editDisplay.setText(expression)
                    operationType = OperationType.SUBSTRACTION
                }
            }
            R.id.button_equal -> {

                if (expression.isNullOrBlank())
                    return

                numberTwo = expression.toFloat();
                when (operationType) {
                    OperationType.ADDITION -> editDisplay.setText((numberOne + numberTwo).toString())
                    OperationType.DIVISION -> editDisplay.setText((numberOne / numberTwo).toString())
                    OperationType.MULTIPLICATION -> editDisplay.setText((numberOne * numberTwo).toString())
                    OperationType.SUBSTRACTION ->  editDisplay.setText((numberOne - numberTwo).toString())
                    OperationType.NOP -> editDisplay.setText(numberTwo.toString())
                }

            }

        }
    }
}
