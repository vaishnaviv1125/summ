package commrhardman23.httpsgithub.sumofnumbersandfactorials;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SumFactorialCalculator extends AppCompatActivity {

    public EditText edtxtUserInput;
    public TextView txtvwResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sum_factorial_calculator);

        edtxtUserInput = (EditText) findViewById(R.id.edtxtUserInput);
        txtvwResult = (TextView) findViewById(R.id.txtvwResult);
    }

    /**
     * calcPartialSum is the method for the button to calculate the partial sum from zero to
     * whatever number the user chooses by calling a recursive method
     * @param vw is the button that calcPartialSum is associated with
     */
    public void calcPartialSum(View vw){

        int userNumber = Integer.parseInt(edtxtUserInput.getText().toString());

        int resultOfSum = partialSumCalculator(userNumber);

        txtvwResult.setText("Partial Sum = " + resultOfSum);

    }

    /**
     * partialSumCalculator calculates the partial sum from zero to a number recursively (calls
     * itself multiple times to achieve a specific end)
     * @param startingNumber is the starting number of the partial sum as it counts down to zero
     * @return an integer that stores the partial sum result or intermediate numbers for the
     *         calculation of the partial sum
     */
    private int partialSumCalculator(int startingNumber){

        int result;

        if(startingNumber == 0){

            result = startingNumber;

        } else {

            result = startingNumber + partialSumCalculator(startingNumber-1);

        }

        return result;

    }

    /**
     * calcFactorial is the method for the button to calculate the factorial of whatever number
     * the user chooses by calling a recursive method
     * @param vw is the button that calcFactorial is associated with
     */
    public void calcFactorial(View vw){

        int userNumber = Integer.parseInt(edtxtUserInput.getText().toString());

        int resultOfFactorial = factorialCalculator(userNumber);

        txtvwResult.setText("Factorial = " + resultOfFactorial);

    }

    /**
     * factorialCalculator calculates the factorial of a number recursively (calls itself multiple
     * times to achieve a specific end)
     * @param startingNumber is the starting number of the factorial
     * @return an integer that stores the factorial result or intermediate numbers for the
     *         calculation of the factorial
     */
    private int factorialCalculator(int startingNumber){

        int result;

        if(startingNumber == 1){

            result = startingNumber;

        } else {

            result = startingNumber * factorialCalculator(startingNumber-1);

        }

        return result;

    }
}
