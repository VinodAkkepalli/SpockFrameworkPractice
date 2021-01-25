package org.location.custom;

import java.util.Objects;

/**
 * <b>Description</b> :
 *
 * @author Vinod Akkepalli
 */
public class CustomSrcClass {
    public CustomSrcClass() {
    }

    public String customMethod(int i) {
        if(i == 999 ) {
            return "999 Reply!!!";
        } else {
            return "Custom Reply!!!";
        }
    }
}
