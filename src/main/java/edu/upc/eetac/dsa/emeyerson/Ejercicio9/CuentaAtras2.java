/*
 * Copyright [13/03/2014] [Einar Meyerson Uriarte]
 * 
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package edu.upc.eetac.dsa.emeyerson.Ejercicio9;

public class CuentaAtras2 implements Runnable {

	private String nombre;
	private int s;

	public CuentaAtras2(String nom, int seg) {
		nombre = nom;
		s = seg;
	}

	public void run() {

		while (s >= 0) {

			System.out.println(nombre + " - " + s);

			try {

				Thread.sleep(1000);

			}

			catch (InterruptedException interruptedException) {

				System.out
						.println("First Thread is interrupted when it is  sleeping"
								+ interruptedException);
			}

			s--;

		}
	}
}
