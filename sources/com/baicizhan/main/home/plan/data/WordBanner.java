package com.baicizhan.main.home.plan.data;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.NoProguard;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class WordBanner implements NoProguard {
    public static final int $stable = 0;

    /* renamed from: id, reason: collision with root package name */
    @k
    private final String f22403id;
    private final int imageGradientColor;

    @l
    private final String imagePath;
    private final boolean isDark;

    @l
    private final String link;

    @k
    private final DataType type;

    public WordBanner(@k String id2, boolean z11, @l String str, int i11, @k DataType type, @l String str2) {
        g0.p(id2, "id");
        g0.p(type, "type");
        this.f22403id = id2;
        this.isDark = z11;
        this.imagePath = str;
        this.imageGradientColor = i11;
        this.type = type;
        this.link = str2;
    }

    public static /* synthetic */ WordBanner copy$default(WordBanner wordBanner, String str, boolean z11, String str2, int i11, DataType dataType, String str3, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = wordBanner.f22403id;
        }
        if ((i12 & 2) != 0) {
            z11 = wordBanner.isDark;
        }
        if ((i12 & 4) != 0) {
            str2 = wordBanner.imagePath;
        }
        if ((i12 & 8) != 0) {
            i11 = wordBanner.imageGradientColor;
        }
        if ((i12 & 16) != 0) {
            dataType = wordBanner.type;
        }
        if ((i12 & 32) != 0) {
            str3 = wordBanner.link;
        }
        DataType dataType2 = dataType;
        String str4 = str3;
        return wordBanner.copy(str, z11, str2, i11, dataType2, str4);
    }

    @k
    public final String component1() {
        return this.f22403id;
    }

    public final boolean component2() {
        return this.isDark;
    }

    @l
    public final String component3() {
        return this.imagePath;
    }

    public final int component4() {
        return this.imageGradientColor;
    }

    @k
    public final DataType component5() {
        return this.type;
    }

    @l
    public final String component6() {
        return this.link;
    }

    @k
    public final WordBanner copy(@k String id2, boolean z11, @l String str, int i11, @k DataType type, @l String str2) {
        g0.p(id2, "id");
        g0.p(type, "type");
        return new WordBanner(id2, z11, str, i11, type, str2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WordBanner)) {
            return false;
        }
        WordBanner wordBanner = (WordBanner) obj;
        return g0.g(this.f22403id, wordBanner.f22403id) && this.isDark == wordBanner.isDark && g0.g(this.imagePath, wordBanner.imagePath) && this.imageGradientColor == wordBanner.imageGradientColor && this.type == wordBanner.type && g0.g(this.link, wordBanner.link);
    }

    @k
    public final String getId() {
        return this.f22403id;
    }

    public final int getImageGradientColor() {
        return this.imageGradientColor;
    }

    @l
    public final String getImagePath() {
        return this.imagePath;
    }

    @l
    public final String getLink() {
        return this.link;
    }

    @k
    public final DataType getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = ((this.f22403id.hashCode() * 31) + Boolean.hashCode(this.isDark)) * 31;
        String str = this.imagePath;
        int hashCode2 = (((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.imageGradientColor)) * 31) + this.type.hashCode()) * 31;
        String str2 = this.link;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isDark() {
        return this.isDark;
    }

    @k
    public String toString() {
        return "WordBanner(id=" + this.f22403id + ", isDark=" + this.isDark + ", imagePath=" + this.imagePath + ", imageGradientColor=" + this.imageGradientColor + ", type=" + this.type + ", link=" + this.link + j.f81007d;
    }

    public /* synthetic */ WordBanner(String str, boolean z11, String str2, int i11, DataType dataType, String str3, int i12, v vVar) {
        this(str, z11, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? 0 : i11, dataType, str3);
    }
}
