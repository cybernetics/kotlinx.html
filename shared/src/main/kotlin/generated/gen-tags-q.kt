package kotlinx.html

import kotlinx.html.*
import kotlinx.html.impl.*
import kotlinx.html.attributes.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

open class Q(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("q", consumer, initialAttributes), AbstractPhrasingContent {
    var cite : String
        get()  = attributeStringString.get(this, "cite")
        set(newValue) {attributeStringString.set(this, "cite", newValue)}


}

