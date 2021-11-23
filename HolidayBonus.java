public class HolidayBonus

{


     // holiday bonuses for each of the stores in the district.

     public static double[] calculateHolidayBonus(double[][] data, double high,

              double low, double other)

     {

          double[][] holidayBonusArr = new double[data.length][];

          for (int i = 0; i < data.length; i++)

          {

              holidayBonusArr[i] = new double[data[i].length];

          }

          for (int i = 0, j = 0; i < holidayBonusArr.length; i++, j++)

          {

              int highIndex = TwoDimRaggedArrayUtility.getHighestInColumnIndex(data, i);

              int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);

              if (i < holidayBonusArr[j].length)

              {

                   holidayBonusArr[highIndex][i] = high;

                   holidayBonusArr[lowIndex][i] = low;

                   if (j == highIndex || j == lowIndex)

                        continue;

                   else

                   {

                        holidayBonusArr[j][i] = other;

                   }

              }

          }

          double[] holidayBonusPerStore = new double[data.length];

          for (int i = 0; i < holidayBonusArr.length; i++)

          {

              for (int j = 0; j < holidayBonusArr[i].length; j++)

              {

                   holidayBonusPerStore[i] += holidayBonusArr[i][j];

              }

          }

          return holidayBonusPerStore;

     }

     

     // returns a double that represents the total of all Holiday Bonuses for the District.

     public static double calculateTotalHolidayBonus(double[][] data,

              double high, double low, double other)

     {

          double[][] holidayBonusArr = new double[data.length][];

          for (int i = 0; i < data.length; i++)

          {

              holidayBonusArr[i] = new double[data[i].length];

          }

          for (int i = 0, j = 0; i < holidayBonusArr.length; i++, j++)

          {

              int highIndex = TwoDimRaggedArrayUtility

                        .getHighestInColumnIndex(data, i);

              int lowIndex = TwoDimRaggedArrayUtility.getLowestInColumnIndex(data,i);

              if (i < holidayBonusArr[j].length)

              {

                   holidayBonusArr[highIndex][i] = high;

                   holidayBonusArr[lowIndex][i] = low;

                   if (j == highIndex || j == lowIndex)

                        continue;

                   else

                   {

                        holidayBonusArr[j][i] = other;

                   }

              }

          }

          double holidayTotal = 0.0;

          for (int i = 0; i < holidayBonusArr.length; i++)

          {

              for (int j = 0; j < holidayBonusArr[i].length; j++)

              {

                   holidayTotal += holidayBonusArr[i][j];

              }

          }

          return holidayTotal;

     }

}