/**
 * 			NativeFmodEx Project
 *
 * Want to use FMOD Ex API (www.fmod.org) in the Java language ? NativeFmodEx is made for you.
 * Copyright � 2005-2010 J�r�me JOUVIE (Jouvieje)
 *
 * Created on 23 feb. 2005
 * @version file v1.5.0
 * @author J�r�me JOUVIE (Jouvieje)
 * @site   http://jerome.jouvie.free.fr/
 * @mail   jerome.jouvie@gmail.com
 * 
 * INTRODUCTION
 * FMOD Ex is a music and sound effects system, by Firelight Technologies Pty, Ltd.
 * More informations can be found at:
 * 		http://www.fmod.org/
 * The aim of this project is to provide a java interface for this amazing sound API.
 * 
 * 
 * GNU LESSER GENERAL PUBLIC LICENSE
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation; either version 2.1 of the License,
 * or (at your option) any later version.
 * 
 * This library is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the
 * Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330,
 * Boston, MA 02111-1307 USA 
 */

package org.jouvieje.fmoddesigner.enumerations;

import org.jouvieje.fmoddesigner.*;
import org.jouvieje.fmodex.exceptions.*;
import org.jouvieje.fmoddesigner.callbacks.*;
import org.jouvieje.fmoddesigner.*;
import org.jouvieje.fmoddesigner.defines.*;
import org.jouvieje.fmoddesigner.enumerations.*;
import org.jouvieje.fmoddesigner.structures.*;
import java.nio.*;
import org.jouvieje.fmodex.*;
import org.jouvieje.fmodex.System;
import org.jouvieje.fmodex.enumerations.*;
import org.jouvieje.fmodex.structures.*;
import org.jouvieje.fmodex.utils.*;
import java.util.HashMap;

/**
 * <BR>
 * <BR>
 * Event property types.<BR>
 * <BR><U><B>Remarks</B></U><BR><BR>
 * <BR><U><B>Platforms Supported</B></U><BR><BR>
 * Win32, Win64, Linux, Macintosh, Xbox, Xbox360, PlayStation 2, GameCube, PlayStation Portable, PlayStation 3, Wii<BR>
 * <BR><U><B>See Also</B></U><BR><BR>
 * Event::getPropertyByIndex<BR>
 * Event::getPropertyInfo<BR>
 * 
 */
public class FMOD_EVENTPROPERTY_TYPE implements Enumeration, Comparable {
	/**  */
	public final static FMOD_EVENTPROPERTY_TYPE FMOD_EVENTPROPERTY_TYPE_INT = new FMOD_EVENTPROPERTY_TYPE("FMOD_EVENTPROPERTY_TYPE_INT", 0);
	/**  */
	public final static FMOD_EVENTPROPERTY_TYPE FMOD_EVENTPROPERTY_TYPE_FLOAT = new FMOD_EVENTPROPERTY_TYPE("FMOD_EVENTPROPERTY_TYPE_FLOAT", EnumerationJNI.get_FMOD_EVENTPROPERTY_TYPE_FLOAT());
	/**  */
	public final static FMOD_EVENTPROPERTY_TYPE FMOD_EVENTPROPERTY_TYPE_STRING = new FMOD_EVENTPROPERTY_TYPE("FMOD_EVENTPROPERTY_TYPE_STRING", EnumerationJNI.get_FMOD_EVENTPROPERTY_TYPE_STRING());

	private final static HashMap VALUES = new HashMap(2*3);
	static {
		VALUES.put(new Integer(FMOD_EVENTPROPERTY_TYPE_INT.asInt()), FMOD_EVENTPROPERTY_TYPE_INT);
		VALUES.put(new Integer(FMOD_EVENTPROPERTY_TYPE_FLOAT.asInt()), FMOD_EVENTPROPERTY_TYPE_FLOAT);
		VALUES.put(new Integer(FMOD_EVENTPROPERTY_TYPE_STRING.asInt()), FMOD_EVENTPROPERTY_TYPE_STRING);
	}

	private final String name;
	private final int nativeValue;
	private FMOD_EVENTPROPERTY_TYPE(String name, int nativeValue) {
		this.name = name;
		this.nativeValue = nativeValue;
	}

	public int asInt() {
		return nativeValue;
	}
	public String toString() {
		return name;
	}
	public boolean equals(Object object) {
		if(object instanceof FMOD_EVENTPROPERTY_TYPE) {
			return asInt() == ((FMOD_EVENTPROPERTY_TYPE)object).asInt();
		}
		return false;
	}
	public int compareTo(Object object) {
		return asInt() - ((FMOD_EVENTPROPERTY_TYPE)object).asInt();
	}


	/**
	 * Retrieve a FMOD_EVENTPROPERTY_TYPE enum field with his integer value
	 * @param nativeValue the integer value of the field to retrieve
	 * @return the FMOD_EVENTPROPERTY_TYPE enum field that correspond to the integer value
	 */
	public static FMOD_EVENTPROPERTY_TYPE get(int nativeValue) {
		return (FMOD_EVENTPROPERTY_TYPE)VALUES.get(new Integer(nativeValue));
	}

	/**
	 * Retrieve a FMOD_EVENTPROPERTY_TYPE enum field from a Pointer
	 * @param pointer a pointer holding an FMOD_EVENTPROPERTY_TYPE enum field
	 * @return the FMOD_EVENTPROPERTY_TYPE enum field that correspond to the enum field in the pointer
	 */
	public static FMOD_EVENTPROPERTY_TYPE get(Pointer pointer) {
		return get(pointer.asInt());
	}

	/**
	 * @return an <code>Iterator</code> over the elements in this enumeration.<BR>
	 * Can be cast to <code>Iterator<FMOD_EVENTPROPERTY_TYPE></code> in Java 1.5.
	 */
	public static java.util.Iterator iterator() {
		return new java.util.Iterator(){
			private java.util.Iterator i = VALUES.values().iterator();	//Wrapper of the HashMap iterator
			public boolean hasNext() { return i.hasNext(); }
			public Object next() { return i.next(); }
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}
}
