package com.hackathon.utils;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hackathon.dto.IDCardDTO;

public class CardPrintingUtils {


	private static final Logger logger = LoggerFactory.getLogger(CardPrintingUtils.class);

	
	public static void printCards(List<IDCardDTO> cards , String tenplatePath, String outputFilePath)
	{
		logger.info("filePath = "+outputFilePath);
                try
                {
                	for(IDCardDTO card : cards)
                	{
                		System.out.println("----------------------------------");
                		System.out.println("Event Name :"  + card.eventName);
                		System.out.println("Host Logo  :"  + card.logoPath);
                		System.out.println("Host Inst. Name  :"  + card.hostName);
                		System.out.println("Event Duration :"  + card.eventDuration);
                		System.out.println("Passport Photo :"  + card.personPhoto);
                		System.out.println("Full Name :"  + card.personFullName);
                		System.out.println("Affilliation :"  + card.personAffilliation);
                		System.out.println("Place :"  + card.personPlace);
                		System.out.println("Country :"  + card.personCountry);
                		System.out.println("Visitor Area :");
                		System.out.println("Endorsement :");
                		System.out.println("Group Name :"  + card.grouopName);
                		System.out.println("Icon Path :"  + card.iconPath);
                		System.out.println("Barcode Path :"  + card.barcodePath);
                		
                		
                	}
                }
                catch (Exception e) {
					e.printStackTrace();
				}
	}
	
}
