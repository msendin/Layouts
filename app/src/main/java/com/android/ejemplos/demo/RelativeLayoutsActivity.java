package com.android.ejemplos.demo;

import android.app.Activity;
import android.os.Bundle;

/** Demonstrates the use of relative layouts. 
 *  <p>
 *  From <a href="http://www.coreservlets.com/android-tutorial/">
 *  the coreservlets.com Android programming tutorial series</a>.
 */

public class RelativeLayoutsActivity extends Activity {
    /** Initializes the app when it is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layouts);
    }
}