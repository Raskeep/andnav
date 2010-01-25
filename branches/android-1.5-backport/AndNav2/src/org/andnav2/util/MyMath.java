// Created by plusminus on 20:36:01 - 26.09.2008
package org.andnav2.util;

import org.andnav2.osm.util.constants.MathConstants;

/**
 * 
 * @author Nicolas Gramlich
 *
 */
public class MyMath implements MathConstants {
	// ===========================================================
	// Constants
	// ===========================================================

	// ===========================================================
	// Fields
	// ===========================================================

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	// ===========================================================
	// Methods from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	/**
	 * <b>Example:</b> <code>invMod(134,50) == 100</code>
	 * 
	 * @param aNumber
	 * @param aModulo
	 */
	public static int invMod(final int aNumber, final int aModulo){
		return aNumber - (aNumber % aModulo);
	}

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
