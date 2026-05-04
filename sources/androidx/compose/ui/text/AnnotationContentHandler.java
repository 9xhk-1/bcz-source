package androidx.compose.ui.text;

import android.text.Editable;
import com.meizu.cloud.pushsdk.notification.model.AppIconSetting;
import java.util.ArrayList;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHtml.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,378:1\n1#2:379\n3792#3:380\n4307#3,2:381\n34#4,6:383\n*S KotlinDebug\n*F\n+ 1 Html.android.kt\nandroidx/compose/ui/text/AnnotationContentHandler\n*L\n308#1:380\n308#1:381,2\n309#1:383,6\n*E\n"})
/* loaded from: classes2.dex */
final class AnnotationContentHandler implements ContentHandler {
    private int bulletIndentation;

    @k
    private final ContentHandler contentHandler;

    @l
    private BulletSpanWithLevel currentBulletSpan;

    @k
    private final Editable output;

    public AnnotationContentHandler(@k ContentHandler contentHandler, @k Editable editable) {
        this.contentHandler = contentHandler;
        this.output = editable;
    }

    private final void commitCurrentBulletSpan() {
        BulletSpanWithLevel bulletSpanWithLevel = this.currentBulletSpan;
        if (bulletSpanWithLevel != null) {
            this.output.setSpan(bulletSpanWithLevel, bulletSpanWithLevel.getStart(), this.output.length(), 33);
        }
        this.currentBulletSpan = null;
    }

    private final void handleAnnotationEnd() {
        Editable editable = this.output;
        Object[] spans = editable.getSpans(0, editable.length(), AnnotationSpan.class);
        ArrayList arrayList = new ArrayList();
        for (Object obj : spans) {
            if (this.output.getSpanFlags((AnnotationSpan) obj) == 17) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            AnnotationSpan annotationSpan = (AnnotationSpan) arrayList.get(i11);
            int spanStart = this.output.getSpanStart(annotationSpan);
            int length = this.output.length();
            this.output.removeSpan(annotationSpan);
            if (spanStart != length) {
                this.output.setSpan(annotationSpan, spanStart, length, 33);
            }
        }
    }

    private final void handleAnnotationStart(Attributes attributes) {
        int length = attributes.getLength();
        for (int i11 = 0; i11 < length; i11++) {
            String localName = attributes.getLocalName(i11);
            if (localName == null) {
                localName = "";
            }
            String value = attributes.getValue(i11);
            String str = value != null ? value : "";
            if (localName.length() > 0 && str.length() > 0) {
                int length2 = this.output.length();
                this.output.setSpan(new AnnotationSpan(localName, str), length2, length2, 17);
            }
        }
    }

    private final void handleLiEnd() {
        commitCurrentBulletSpan();
    }

    private final void handleLiStart() {
        commitCurrentBulletSpan();
        this.currentBulletSpan = new BulletSpanWithLevel(BulletKt.getDefaultBullet(), this.bulletIndentation, this.output.length());
    }

    private final void handleUlEnd() {
        commitCurrentBulletSpan();
        this.bulletIndentation--;
    }

    private final void handleUlStart() {
        commitCurrentBulletSpan();
        this.bulletIndentation++;
    }

    @Override // org.xml.sax.ContentHandler
    public void characters(char[] cArr, int i11, int i12) {
        this.contentHandler.characters(cArr, i11, i12);
    }

    @Override // org.xml.sax.ContentHandler
    public void endDocument() {
        this.contentHandler.endDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void endElement(@l String str, @l String str2, @l String str3) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        handleUlEnd();
                        return;
                    }
                } else if (str2.equals(AppIconSetting.LARGE_ICON_URL)) {
                    handleLiEnd();
                    return;
                }
            } else if (str2.equals("annotation")) {
                handleAnnotationEnd();
                return;
            }
        }
        this.contentHandler.endElement(str, str2, str3);
    }

    @Override // org.xml.sax.ContentHandler
    public void endPrefixMapping(String str) {
        this.contentHandler.endPrefixMapping(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void ignorableWhitespace(char[] cArr, int i11, int i12) {
        this.contentHandler.ignorableWhitespace(cArr, i11, i12);
    }

    @Override // org.xml.sax.ContentHandler
    public void processingInstruction(String str, String str2) {
        this.contentHandler.processingInstruction(str, str2);
    }

    @Override // org.xml.sax.ContentHandler
    public void setDocumentLocator(Locator locator) {
        this.contentHandler.setDocumentLocator(locator);
    }

    @Override // org.xml.sax.ContentHandler
    public void skippedEntity(String str) {
        this.contentHandler.skippedEntity(str);
    }

    @Override // org.xml.sax.ContentHandler
    public void startDocument() {
        this.contentHandler.startDocument();
    }

    @Override // org.xml.sax.ContentHandler
    public void startElement(@l String str, @l String str2, @l String str3, @l Attributes attributes) {
        if (str2 != null) {
            int hashCode = str2.hashCode();
            if (hashCode != -1555043537) {
                if (hashCode != 3453) {
                    if (hashCode == 3735 && str2.equals("ul")) {
                        handleUlStart();
                        return;
                    }
                } else if (str2.equals(AppIconSetting.LARGE_ICON_URL)) {
                    handleLiStart();
                    return;
                }
            } else if (str2.equals("annotation")) {
                if (attributes != null) {
                    handleAnnotationStart(attributes);
                    return;
                }
                return;
            }
        }
        this.contentHandler.startElement(str, str2, str3, attributes);
    }

    @Override // org.xml.sax.ContentHandler
    public void startPrefixMapping(String str, String str2) {
        this.contentHandler.startPrefixMapping(str, str2);
    }
}
