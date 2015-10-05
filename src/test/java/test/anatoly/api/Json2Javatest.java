package test.anatoly.api;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

import test.api.wsdl.v17.SalesOrderEntity;

import com.google.gson.Gson;

public class Json2Javatest {

	@Test
	public void test() {
		Gson gson = new Gson();

		try {

			BufferedReader br = new BufferedReader(
				new FileReader("d:/Eclipse-projects/duomo-sync/test.api/src/test/resources/order.json"));

			//convert the json string back to object
			SalesOrderEntity obj = gson.fromJson(br, SalesOrderEntity.class);

			System.out.println(obj.getItems()[0].getGift_message_id());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
