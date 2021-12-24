package com.halodoc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestExample2 {
//
////	List<CityDeails> cityDetails = new ArrayList<CityDeails>();;
////	Map<String,List<CityDeails>> cityDB = new HashMap();
//	
//	Map<Object,String> cityDetails = new HashMap<Object, String>();
//	Map<String,Map<Object,String>> city = new HashMap<String, Map<Object,String>>();
//	
//	public boolean addCityValue(Map<String,String> city) throws Exception {
//		
//		validateInput(city.get(0));
//		try {
//			addCityOnDB(city);
//		}catch(Exception e){
//			System.out.println(e.getMessage());
//			throw new Exception(e);
//		}
//	}
//
//	private void addCityOnDB(Map<String, String> city) throws Exception {
//	
//		for(Map.Entry<String, String> mp : city.entrySet()) {
//			if(isNumber(mp.getValue())) {
//				Map<>
//			}
//		}
//		
//	}
//
//	private boolean isNumber(String val) {
//		for(int i=0; i<val.length(); i++) {
//			if(Character.isDigit(val.charAt(i)) == false) {
//				return false;
//			}
//		}
//		return true;
//		
//	}
//
//	private void validateInput(String city) throws Exception {
//		if(city.isEmpty()) {
//			throw new Exception("name is mandatory");
//		}
//		
//	}
//
}

class CityDeails {
	
//	TreeMap tp = new TreeMap();
//	Map<String,TreeMap> city = new HashMap();
	
	private String cityName;
	private Long longtitude;
	private Long latitude;
	private String pollutionLevel;
	private Boolean free_food;
	private String Capital;
	private String population;
	private String category;
	private String manufacturer;
	
	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public Long getLongtitude() {
		return longtitude;
	}
	public void setLongtitude(Long longtitude) {
		this.longtitude = longtitude;
	}
	public Long getLatitude() {
		return latitude;
	}
	public void setLatitude(Long latitude) {
		this.latitude = latitude;
	}
	public String getPollutionLevel() {
		return pollutionLevel;
	}
	public void setPollutionLevel(String pollutionLevel) {
		this.pollutionLevel = pollutionLevel;
	}
	public Boolean getFree_food() {
		return free_food;
	}
	public void setFree_food(Boolean free_food) {
		this.free_food = free_food;
	}
	public String getCapital() {
		return Capital;
	}
	public void setCapital(String capital) {
		Capital = capital;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CityDeails [cityName=");
		builder.append(cityName);
		builder.append(", longtitude=");
		builder.append(longtitude);
		builder.append(", latitude=");
		builder.append(latitude);
		builder.append(", pollutionLevel=");
		builder.append(pollutionLevel);
		builder.append(", free_food=");
		builder.append(free_food);
		builder.append(", Capital=");
		builder.append(Capital);
		builder.append(", population=");
		builder.append(population);
		builder.append(", category=");
		builder.append(category);
		builder.append(", manufacturer=");
		builder.append(manufacturer);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
}
