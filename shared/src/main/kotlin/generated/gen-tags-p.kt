package html4k

import html4k.*
import html4k.impl.*

/*******************************************************************************
    DO NOT EDIT
    This file was generated by module generate
*******************************************************************************/

public class P(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("p", consumer, initialAttributes) {
    var onAbort : String by StringAttribute("onabort")
    var contentEditable : Boolean by BooleanAttribute("contenteditable")
    var onLoadedMetaData : String by StringAttribute("onloadedmetadata")
    var onScroll : String by StringAttribute("onscroll")
    var onSeeking : String by StringAttribute("onseeking")
    var id : String by StringAttribute("id")
    var onLoad : String by StringAttribute("onload")
    var onDragStart : String by StringAttribute("ondragstart")
    var onInput : String by StringAttribute("oninput")
    var onTimeUpdate : String by StringAttribute("ontimeupdate")
    var onShow : String by StringAttribute("onshow")
    var onClick : String by StringAttribute("onclick")
    var onFocus : String by StringAttribute("onfocus")
    var contextMenu : String by StringAttribute("contextmenu")
    var onStalled : String by StringAttribute("onstalled")
    var onProgress : String by StringAttribute("onprogress")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var item : String by StringAttribute("item")
    var onVolumeChange : String by StringAttribute("onvolumechange")
    var onCanPlay : String by StringAttribute("oncanplay")
    var onContextMenu : String by StringAttribute("oncontextmenu")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var runAt : RunAt by EnumAttribute("runat", runAtValues)
    var onError : String by StringAttribute("onerror")
    var onFormChange : String by StringAttribute("onformchange")
    var onSeeked : String by StringAttribute("onseeked")
    var onLoadedData : String by StringAttribute("onloadeddata")
    var onDurationChange : String by StringAttribute("ondurationchange")
    var onMouseOver : String by StringAttribute("onmouseover")
    var onMouseWheel : String by StringAttribute("onmousewheel")
    var onDrag : String by StringAttribute("ondrag")
    var onDragLeave : String by StringAttribute("ondragleave")
    var onPlaying : String by StringAttribute("onplaying")
    var onFormInput : String by StringAttribute("onforminput")
    var onKeyUp : String by StringAttribute("onkeyup")
    var onRateChange : String by StringAttribute("onratechange")
    var onKeyDown : String by StringAttribute("onkeydown")
    var onMouseDown : String by StringAttribute("onmousedown")
    var onChange : String by StringAttribute("onchange")
    var onKeyPress : String by StringAttribute("onkeypress")
    var itemProp : String by StringAttribute("itemprop")
    var onDoubleClick : String by StringAttribute("ondblclick")
    var onReadyStateChange : String by StringAttribute("onreadystatechange")
    var onDragEnter : String by StringAttribute("ondragenter")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var onWaiting : String by StringAttribute("onwaiting")
    var onPause : String by StringAttribute("onpause")
    var accessKey : String by StringAttribute("accesskey")
    var style : String by StringAttribute("style")
    var onEmptied : String by StringAttribute("onemptied")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var onSelect : String by StringAttribute("onselect")
    var onLoadStart : String by StringAttribute("onloadstart")
    var onDragOver : String by StringAttribute("ondragover")
    var onSuspend : String by StringAttribute("onsuspend")
    var onMouseUp : String by StringAttribute("onmouseup")
    var tabIndex : String by StringAttribute("tabIndex")
    var role : String by StringAttribute("role")
    var onMouseMove : String by StringAttribute("onmousemove")
    var onMouseOut : String by StringAttribute("onmouseout")
    var onPlay : String by StringAttribute("onplay")
    var onCanPlayThrough : String by StringAttribute("oncanplaythrough")
    var onEnded : String by StringAttribute("onended")
    var onBlur : String by StringAttribute("onblur")
    var dataMsgId : String by StringAttribute("data-MsgId")
    var onDrop : String by StringAttribute("ondrop")
    var onInvalid : String by StringAttribute("oninvalid")
    var spellCheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var dataFolderName : String by StringAttribute("data-FolderName")
    var onSubmit : String by StringAttribute("onsubmit")

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class PROGRESS(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("progress", consumer, initialAttributes) {
    var onAbort : String by StringAttribute("onabort")
    var contentEditable : Boolean by BooleanAttribute("contenteditable")
    var onLoadedMetaData : String by StringAttribute("onloadedmetadata")
    var onScroll : String by StringAttribute("onscroll")
    var onSeeking : String by StringAttribute("onseeking")
    var id : String by StringAttribute("id")
    var onLoad : String by StringAttribute("onload")
    var onDragStart : String by StringAttribute("ondragstart")
    var onInput : String by StringAttribute("oninput")
    var onTimeUpdate : String by StringAttribute("ontimeupdate")
    var onShow : String by StringAttribute("onshow")
    var onClick : String by StringAttribute("onclick")
    var max : String by StringAttribute("max")
    var onFocus : String by StringAttribute("onfocus")
    var contextMenu : String by StringAttribute("contextmenu")
    var onStalled : String by StringAttribute("onstalled")
    var onProgress : String by StringAttribute("onprogress")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var item : String by StringAttribute("item")
    var onVolumeChange : String by StringAttribute("onvolumechange")
    var onCanPlay : String by StringAttribute("oncanplay")
    var onContextMenu : String by StringAttribute("oncontextmenu")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var runAt : RunAt by EnumAttribute("runat", runAtValues)
    var onError : String by StringAttribute("onerror")
    var onFormChange : String by StringAttribute("onformchange")
    var onSeeked : String by StringAttribute("onseeked")
    var value : String by StringAttribute("value")
    var onLoadedData : String by StringAttribute("onloadeddata")
    var onDurationChange : String by StringAttribute("ondurationchange")
    var onMouseOver : String by StringAttribute("onmouseover")
    var onMouseWheel : String by StringAttribute("onmousewheel")
    var onDrag : String by StringAttribute("ondrag")
    var onDragLeave : String by StringAttribute("ondragleave")
    var onPlaying : String by StringAttribute("onplaying")
    var onFormInput : String by StringAttribute("onforminput")
    var onKeyUp : String by StringAttribute("onkeyup")
    var onRateChange : String by StringAttribute("onratechange")
    var onKeyDown : String by StringAttribute("onkeydown")
    var onMouseDown : String by StringAttribute("onmousedown")
    var onChange : String by StringAttribute("onchange")
    var onKeyPress : String by StringAttribute("onkeypress")
    var itemProp : String by StringAttribute("itemprop")
    var onDoubleClick : String by StringAttribute("ondblclick")
    var onReadyStateChange : String by StringAttribute("onreadystatechange")
    var onDragEnter : String by StringAttribute("ondragenter")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var onWaiting : String by StringAttribute("onwaiting")
    var onPause : String by StringAttribute("onpause")
    var accessKey : String by StringAttribute("accesskey")
    var style : String by StringAttribute("style")
    var onEmptied : String by StringAttribute("onemptied")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var onSelect : String by StringAttribute("onselect")
    var onLoadStart : String by StringAttribute("onloadstart")
    var onDragOver : String by StringAttribute("ondragover")
    var onSuspend : String by StringAttribute("onsuspend")
    var onMouseUp : String by StringAttribute("onmouseup")
    var tabIndex : String by StringAttribute("tabIndex")
    var role : String by StringAttribute("role")
    var onMouseMove : String by StringAttribute("onmousemove")
    var onMouseOut : String by StringAttribute("onmouseout")
    var onPlay : String by StringAttribute("onplay")
    var onCanPlayThrough : String by StringAttribute("oncanplaythrough")
    var onEnded : String by StringAttribute("onended")
    var onBlur : String by StringAttribute("onblur")
    var dataMsgId : String by StringAttribute("data-MsgId")
    var onDrop : String by StringAttribute("ondrop")
    var onInvalid : String by StringAttribute("oninvalid")
    var spellCheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var dataFolderName : String by StringAttribute("data-FolderName")
    var onSubmit : String by StringAttribute("onsubmit")

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class PRE(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("pre", consumer, initialAttributes) {
    var onAbort : String by StringAttribute("onabort")
    var contentEditable : Boolean by BooleanAttribute("contenteditable")
    var onLoadedMetaData : String by StringAttribute("onloadedmetadata")
    var onScroll : String by StringAttribute("onscroll")
    var onSeeking : String by StringAttribute("onseeking")
    var id : String by StringAttribute("id")
    var onLoad : String by StringAttribute("onload")
    var onDragStart : String by StringAttribute("ondragstart")
    var onInput : String by StringAttribute("oninput")
    var onTimeUpdate : String by StringAttribute("ontimeupdate")
    var onShow : String by StringAttribute("onshow")
    var onClick : String by StringAttribute("onclick")
    var onFocus : String by StringAttribute("onfocus")
    var contextMenu : String by StringAttribute("contextmenu")
    var onStalled : String by StringAttribute("onstalled")
    var onProgress : String by StringAttribute("onprogress")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var item : String by StringAttribute("item")
    var onVolumeChange : String by StringAttribute("onvolumechange")
    var onCanPlay : String by StringAttribute("oncanplay")
    var onContextMenu : String by StringAttribute("oncontextmenu")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var runAt : RunAt by EnumAttribute("runat", runAtValues)
    var onError : String by StringAttribute("onerror")
    var onFormChange : String by StringAttribute("onformchange")
    var onSeeked : String by StringAttribute("onseeked")
    var onLoadedData : String by StringAttribute("onloadeddata")
    var onDurationChange : String by StringAttribute("ondurationchange")
    var onMouseOver : String by StringAttribute("onmouseover")
    var onMouseWheel : String by StringAttribute("onmousewheel")
    var onDrag : String by StringAttribute("ondrag")
    var onDragLeave : String by StringAttribute("ondragleave")
    var onPlaying : String by StringAttribute("onplaying")
    var onFormInput : String by StringAttribute("onforminput")
    var onKeyUp : String by StringAttribute("onkeyup")
    var onRateChange : String by StringAttribute("onratechange")
    var onKeyDown : String by StringAttribute("onkeydown")
    var onMouseDown : String by StringAttribute("onmousedown")
    var onChange : String by StringAttribute("onchange")
    var onKeyPress : String by StringAttribute("onkeypress")
    var itemProp : String by StringAttribute("itemprop")
    var onDoubleClick : String by StringAttribute("ondblclick")
    var onReadyStateChange : String by StringAttribute("onreadystatechange")
    var onDragEnter : String by StringAttribute("ondragenter")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var onWaiting : String by StringAttribute("onwaiting")
    var onPause : String by StringAttribute("onpause")
    var accessKey : String by StringAttribute("accesskey")
    var style : String by StringAttribute("style")
    var onEmptied : String by StringAttribute("onemptied")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var onSelect : String by StringAttribute("onselect")
    var onLoadStart : String by StringAttribute("onloadstart")
    var onDragOver : String by StringAttribute("ondragover")
    var onSuspend : String by StringAttribute("onsuspend")
    var onMouseUp : String by StringAttribute("onmouseup")
    var tabIndex : String by StringAttribute("tabIndex")
    var role : String by StringAttribute("role")
    var onMouseMove : String by StringAttribute("onmousemove")
    var onMouseOut : String by StringAttribute("onmouseout")
    var onPlay : String by StringAttribute("onplay")
    var onCanPlayThrough : String by StringAttribute("oncanplaythrough")
    var onEnded : String by StringAttribute("onended")
    var onBlur : String by StringAttribute("onblur")
    var dataMsgId : String by StringAttribute("data-MsgId")
    var onDrop : String by StringAttribute("ondrop")
    var onInvalid : String by StringAttribute("oninvalid")
    var spellCheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var dataFolderName : String by StringAttribute("data-FolderName")
    var onSubmit : String by StringAttribute("onsubmit")

    override
    fun a(href : String?, target : String?, block : A.() -> Unit) : Unit = super.a(href, target, block)

    override
    fun abbr(block : ABBR.() -> Unit) : Unit = super.abbr(block)

    override
    fun area(alt : String?, content : String) : Unit = super.area(alt, content)

    override
    fun audio(block : AUDIO.() -> Unit) : Unit = super.audio(block)

    override
    fun b(block : B.() -> Unit) : Unit = super.b(block)

    override
    fun bdi(block : BDI.() -> Unit) : Unit = super.bdi(block)

    override
    fun bdo(block : BDO.() -> Unit) : Unit = super.bdo(block)

    override
    fun br(content : String) : Unit = super.br(content)

    override
    fun button(block : BUTTON.() -> Unit) : Unit = super.button(block)

    override
    fun canvas(content : String) : Unit = super.canvas(content)

    override
    fun cite(block : CITE.() -> Unit) : Unit = super.cite(block)

    override
    fun code(block : CODE.() -> Unit) : Unit = super.code(block)

    override
    fun command(content : String) : Unit = super.command(content)

    override
    fun dataList(block : DATALIST.() -> Unit) : Unit = super.dataList(block)

    override
    fun del(block : DEL.() -> Unit) : Unit = super.del(block)

    override
    fun dfn(block : DFN.() -> Unit) : Unit = super.dfn(block)

    override
    fun em(block : EM.() -> Unit) : Unit = super.em(block)

    override
    fun embed(content : String) : Unit = super.embed(content)

    override
    fun i(block : I.() -> Unit) : Unit = super.i(block)

    override
    fun iframe(content : String) : Unit = super.iframe(content)

    override
    fun img(alt : String?, src : String?, content : String) : Unit = super.img(alt, src, content)

    override
    fun input(alt : String?, content : String) : Unit = super.input(alt, content)

    override
    fun ins(block : INS.() -> Unit) : Unit = super.ins(block)

    override
    fun kbd(block : KBD.() -> Unit) : Unit = super.kbd(block)

    override
    fun keyGen(content : String) : Unit = super.keyGen(content)

    override
    fun label(block : LABEL.() -> Unit) : Unit = super.label(block)

    override
    fun link(content : String) : Unit = super.link(content)

    override
    fun map(block : MAP.() -> Unit) : Unit = super.map(block)

    override
    fun mark(block : MARK.() -> Unit) : Unit = super.mark(block)

    override
    fun math(block : MATH.() -> Unit) : Unit = super.math(block)

    override
    fun meta(content : String) : Unit = super.meta(content)

    override
    fun meter(block : METER.() -> Unit) : Unit = super.meter(block)

    override
    fun noScript(block : NOSCRIPT.() -> Unit) : Unit = super.noScript(block)

    override
    fun object_(block : OBJECT_.() -> Unit) : Unit = super.object_(block)

    override
    fun output(block : OUTPUT.() -> Unit) : Unit = super.output(block)

    override
    fun progress(block : PROGRESS.() -> Unit) : Unit = super.progress(block)

    override
    fun q(block : Q.() -> Unit) : Unit = super.q(block)

    override
    fun ruby(block : RUBY.() -> Unit) : Unit = super.ruby(block)

    override
    fun samp(block : SAMP.() -> Unit) : Unit = super.samp(block)

    override
    fun script(type : String?, src : String?, content : String) : Unit = super.script(type, src, content)

    override
    fun select(block : SELECT.() -> Unit) : Unit = super.select(block)

    override
    fun small(block : SMALL.() -> Unit) : Unit = super.small(block)

    override
    fun span(block : SPAN.() -> Unit) : Unit = super.span(block)

    override
    fun strong(block : STRONG.() -> Unit) : Unit = super.strong(block)

    override
    fun sub(block : SUB.() -> Unit) : Unit = super.sub(block)

    override
    fun sup(block : SUP.() -> Unit) : Unit = super.sup(block)

    override
    fun svg(content : String) : Unit = super.svg(content)

    override
    fun textArea(rowS : RowS?, colS : ColS?, content : String) : Unit = super.textArea(rowS, colS, content)

    override
    fun time(block : TIME.() -> Unit) : Unit = super.time(block)

    override
    fun var_(block : VAR_.() -> Unit) : Unit = super.var_(block)

    override
    fun video(block : VIDEO.() -> Unit) : Unit = super.video(block)

}

public class PARAM(initialAttributes : Map<String, String>, override val consumer : TagConsumer<*>) : HTMLTag("param", consumer, initialAttributes) {
    var contentEditable : Boolean by BooleanAttribute("contenteditable")
    var draggable : Draggable by EnumAttribute("draggable", draggableValues)
    var tabIndex : String by StringAttribute("tabIndex")
    var item : String by StringAttribute("item")
    var itemProp : String by StringAttribute("itemprop")
    var role : String by StringAttribute("role")
    var subject : String by StringAttribute("subject")
    var classes : String by StringAttribute("class")
    var runAt : RunAt by EnumAttribute("runat", runAtValues)
    var id : String by StringAttribute("id")
    var value : String by StringAttribute("value")
    var dataMsgId : String by StringAttribute("data-MsgId")
    var hidden : Boolean by BooleanAttribute("hidden")
    var lang : String by StringAttribute("lang")
    var accessKey : String by StringAttribute("accesskey")
    var spellCheck : Boolean by BooleanAttribute("spellcheck")
    var title : String by StringAttribute("title")
    var style : String by StringAttribute("style")
    var dir : Dir by EnumAttribute("dir", dirValues)
    var name : String by StringAttribute("name")
    var contextMenu : String by StringAttribute("contextmenu")
    var dataFolderName : String by StringAttribute("data-FolderName")

}

