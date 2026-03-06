package com.searchfilter;

import com.contactmanagement.*;
import java.util.List;

public interface StrategyFilter {
	List<Contact> filter(List<Contact> contacts, String value);
	
}