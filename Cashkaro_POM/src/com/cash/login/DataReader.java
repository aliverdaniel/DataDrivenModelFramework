package com.cash.login;

import java.util.ArrayList;
import java.util.List;

public class DataReader extends Excel{

	public static List<ObjectReader> methodValues;
	public static List<DataSheetReader> eachMethodKeysandValues;
	
	public static void mvalueinitialization(){
		methodValues=new ArrayList<ObjectReader>();
		eachMethodKeysandValues=new ArrayList<DataSheetReader>();
	}
	
	public static void getData(String method){

		for(int i=0;i<excelTestList.size();i++){

			if(method.equalsIgnoreCase(excelTestList.get(i).getmethodName())){

				ObjectReader mValues=new ObjectReader(excelTestList.get(i).getdataSet(),excelTestList.get(i).getattribute(),excelTestList.get(i).getattributeName());
				System.out.println(excelTestList.size()+method);
				methodValues.add(mValues);
			}

		}

	}
	
	public static void getDataKeyandValue(String methodName){

		for(int i=0;i<dataSheetKeysandvalues.size();i++){

			if(methodName.equalsIgnoreCase(dataSheetKeysandvalues.get(i).getDataSheetMethodName())){

				DataSheetReader ValuesandKeys=new DataSheetReader(dataSheetKeysandvalues.get(i).getDatakey(),dataSheetKeysandvalues.get(i).getDatakeyValue());
				eachMethodKeysandValues.add(ValuesandKeys);
			}

		}
	}
	
	public static String getAttributeandAttributevalue(String dataSet){
		String attribute;
		String attributeValue;
		String attribute_attributeValue = null;
		for(int i=0;i<methodValues.size();i++){

			if(dataSet.equalsIgnoreCase(methodValues.get(i).getmdataSet())){
				attribute=methodValues.get(i).getmattribute();
				attributeValue=methodValues.get(i).getmattributeName();
				attribute_attributeValue=attribute+"#"+attributeValue;

			}
			
		}
		return attribute_attributeValue;
	}
	
	public static String getEachKeyandKeyValue(String dataKey){
		String keyValue = null;
		
		for(int i=0;i<eachMethodKeysandValues.size();i++){

			if(dataKey.equalsIgnoreCase(eachMethodKeysandValues.get(i).geteachMerthoddataSheetDataKey())){
				keyValue=eachMethodKeysandValues.get(i).getseteachMethodDataSheetDataKeyValue();

			}
		
		}
		return keyValue;
	}

	
	

}
