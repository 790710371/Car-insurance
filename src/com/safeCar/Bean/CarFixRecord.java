package com.safeCar.Bean;

import javax.xml.crypto.Data;

public class CarFixRecord {
		int id_fix; 
		Data data_insure;
		public int getId_fix() {
			return id_fix;
		}
		public void setId_fix(int id_fix) {
			this.id_fix = id_fix;
		}
		public Data getData_insure() {
			return data_insure;
		}
		public void setData_insure(Data data_insure) {
			this.data_insure = data_insure;
		}
}
