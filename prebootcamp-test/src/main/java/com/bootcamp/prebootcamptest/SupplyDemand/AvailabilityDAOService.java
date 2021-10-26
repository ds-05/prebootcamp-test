package com.bootcamp.prebootcamptest.SupplyDemand;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

	@Component
	public class AvailabilityDAOService {
		private static List<Supply> supplyRecord = new ArrayList<>();
		private static List<Demand> demandRecord = new ArrayList<>();

		static {
			supplyRecord.add(new Supply("Product1", 10.0));
			supplyRecord.add(new Supply("Product2", 5.0));
		}
		static {
			demandRecord.add(new Demand("Product1", 2.0));
			demandRecord.add(new Demand("Product2", 5.0));
		}

		public int checkAvailability(String prodId) {


			int avail = 0;

			Supply supplyInstance = supplyRecord.stream().filter(supply -> prodId.equals(supply.getProductId()))
					.findAny().orElse(null);
			Demand demandInstance = demandRecord.stream().filter(demand -> prodId.equals(demand.getProductId()))
					.findAny().orElse(null);

			if (supplyInstance != null && demandInstance != null)
				avail = (int) (supplyInstance.getQuantity() - demandInstance.getQuantity());
			return avail;

		}



	}


