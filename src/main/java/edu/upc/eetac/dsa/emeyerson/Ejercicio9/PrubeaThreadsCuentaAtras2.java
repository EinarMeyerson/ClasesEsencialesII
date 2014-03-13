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

public class PrubeaThreadsCuentaAtras2 {

	public static void main(String args[]) {
		CuentaAtras2 contador1 = new CuentaAtras2("ID1", 4);
		// Creamos el Thread y lo ejecutamos
		Thread hilo1 = new Thread(contador1);
		hilo1.start();

		CuentaAtras2 contador2 = new CuentaAtras2("ID2", 7);
		// Creamos el Thread y lo ejecutamos
		Thread hilo2 = new Thread(contador2);
		hilo2.start();

		CuentaAtras2 contador3 = new CuentaAtras2("ID3", 8);
		// Creamos el Thread y lo ejecutamos
		Thread hilo3 = new Thread(contador3);
		hilo3.start();
	}
}
