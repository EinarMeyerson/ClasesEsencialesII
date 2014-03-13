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
package edu.upc.eetac.dsa.emeyerson.Ejercicio8;

public class CuentaAtras extends Thread {

	private String nombre;
	private int s;
	private static String IDanterior;
	private static String IDactual = "Es el primer thread";
	static int cont = 3;

	public CuentaAtras(String nom, int seg) {
		this.nombre = nom;
		this.s = seg;
	}

	private static void ultimaEscritura(String thread) {
		String valor;
		valor = thread;
		IDanterior = IDactual;
		IDactual = valor;
	}

	public void run() {

		while (s >= 0) {

			ultimaEscritura(nombre);

			if (s == 0)

			{
				cont--;

				System.out.println(nombre + " - " + s + " - ultima escritura "
						+ IDanterior);

				System.out.println("ultima escritura " + nombre + " - " + cont
						+ "  Threads activos");

			}

			else {

				System.out.println(nombre + " - " + s + " - ultima escritura "
						+ IDanterior);

			}

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