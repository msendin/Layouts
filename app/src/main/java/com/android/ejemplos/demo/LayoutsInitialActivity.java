package com.android.ejemplos.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

/** Demonstrates the most common Layout types. The main Activity
 *  simply contains buttons that launch the other Activities. The
 *  other Activities each demonstrate a category of Layout.
 */

public class LayoutsInitialActivity extends Activity {
    /** Initializes the app when it is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    /** Switches to NestedLayoutsActivity when the associated button is clicked. 
     *  The colors.xml file gives different background colors to the leaf-level
     *  Layouts in order to make the nesting easier to see. */
    
    public void showNestedLayouts(View clickedButton) {
        ActivityUtils.goToActivity(this, NestedLayoutsActivity.class);
    }
    
    /** Switches to the LayoutWeightsActivity when the associated button is clicked. */
    
    public void showLayoutWeights(View clickedButton) {
        ActivityUtils.goToActivity(this, LayoutWeightsActivity.class);
    }
    
    /** Switches to the RelativeLayoutsActivity when the associated button is clicked. */
    
    public void showRelativeLayouts(View clickedButton) {
        ActivityUtils.goToActivity(this, RelativeLayoutsActivity.class);
    }
    
    /** Switches to the TableLayoutsActivity when the associated button is clicked. */
    
    public void showTableLayouts(View clickedButton) {
        ActivityUtils.goToActivity(this, TableLayoutsActivity.class);
    }
}