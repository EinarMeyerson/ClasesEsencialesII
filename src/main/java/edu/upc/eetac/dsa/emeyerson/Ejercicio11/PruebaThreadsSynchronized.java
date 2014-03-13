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
package edu.upc.eetac.dsa.emeyerson.Ejercicio11;

public class PruebaThreadsSynchronized {
	public static void main(String args[]) {
		CuentaAtrasSynchronized contador1 = new CuentaAtrasSynchronized("ID1",
				4);
		contador1.start();

		CuentaAtrasSynchronized contador2 = new CuentaAtrasSynchronized("ID2",
				7);
		contador2.start();

		CuentaAtrasSynchronized contador3 = new CuentaAtrasSynchronized("ID3",
				8);
		contador3.start();

	}
}