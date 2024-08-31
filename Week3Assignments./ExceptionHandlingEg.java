
package com.p15;

import com.p16.ExceptionHandlingEg1;

public class ExceptionHandlingEg {

	public static void main(String[] args) {

		try {

			ExceptionHandlingEg1.met();

			int arr[] = { 1, 2, 4, 6 };

			for (int i = 0; i < arr.length; i++) {

				System.out.println(arr[i]);

			}

			String t = "abcd";

			String sub = t.substring(0, 2);

		}

		catch (StringIndexOutOfBoundsException se) {

			System.out.println("String index out of bound excepton" + se);

		}

		catch (ArrayIndexOutOfBoundsException ae) {

			System.out.println("Array index out of bound excepton" + ae);

		}

		catch (NumberFormatException ne) {

			System.out.println("NumberFormatException" + ne);

		}

		catch (Exception e) {
			System.out.println(e);

		} finally {

			System.out.println("This is finally block");

		}

	}

}
