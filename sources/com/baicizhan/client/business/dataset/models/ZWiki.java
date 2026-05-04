package com.baicizhan.client.business.dataset.models;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.List;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import pn.j;
import wo.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class ZWiki {
    public static final int $stable = 8;

    @k
    @c("cnMean")
    private final ZCNMean cnMean;

    @k
    @c("extension")
    private final ZExtension extension;

    @k
    @c("pages")
    private final List<ZSentencePage> pages;

    public ZWiki(@k ZCNMean cnMean, @k List<ZSentencePage> pages, @k ZExtension extension) {
        g0.p(cnMean, "cnMean");
        g0.p(pages, "pages");
        g0.p(extension, "extension");
        this.cnMean = cnMean;
        this.pages = pages;
        this.extension = extension;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ZWiki copy$default(ZWiki zWiki, ZCNMean zCNMean, List list, ZExtension zExtension, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zCNMean = zWiki.cnMean;
        }
        if ((i11 & 2) != 0) {
            list = zWiki.pages;
        }
        if ((i11 & 4) != 0) {
            zExtension = zWiki.extension;
        }
        return zWiki.copy(zCNMean, list, zExtension);
    }

    @k
    public final ZCNMean component1() {
        return this.cnMean;
    }

    @k
    public final List<ZSentencePage> component2() {
        return this.pages;
    }

    @k
    public final ZExtension component3() {
        return this.extension;
    }

    @k
    public final ZWiki copy(@k ZCNMean cnMean, @k List<ZSentencePage> pages, @k ZExtension extension) {
        g0.p(cnMean, "cnMean");
        g0.p(pages, "pages");
        g0.p(extension, "extension");
        return new ZWiki(cnMean, pages, extension);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZWiki)) {
            return false;
        }
        ZWiki zWiki = (ZWiki) obj;
        return g0.g(this.cnMean, zWiki.cnMean) && g0.g(this.pages, zWiki.pages) && g0.g(this.extension, zWiki.extension);
    }

    @k
    public final ZCNMean getCnMean() {
        return this.cnMean;
    }

    @k
    public final ZExtension getExtension() {
        return this.extension;
    }

    @k
    public final List<ZSentencePage> getPages() {
        return this.pages;
    }

    public int hashCode() {
        return (((this.cnMean.hashCode() * 31) + this.pages.hashCode()) * 31) + this.extension.hashCode();
    }

    @k
    public String toString() {
        return "ZWiki(cnMean=" + this.cnMean + ", pages=" + this.pages + ", extension=" + this.extension + j.f81007d;
    }
}
