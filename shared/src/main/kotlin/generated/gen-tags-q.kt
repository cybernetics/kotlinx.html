package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class Q(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("q", consumer, initialAttributes), CommonEventsGroupFacade, CoreServerAttributeGroupFacade, CoreAttributeGroupFacade {
    var cite : String
        get()  = attributeString29bd7c40.get(this, "cite")
        set(newValue) {attributeString29bd7c40.set(this, "cite", newValue)}


}
