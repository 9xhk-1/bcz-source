package com.google.thirdparty.publicsuffix;

import go.a;
import go.b;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import s60.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@b
@a
/* loaded from: classes7.dex */
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY(PublicSuffixDatabase.f77441i, d.f88057a);

    private final char innerNodeCode;
    private final char leafNodeCode;

    PublicSuffixType(char innerNodeCode, char leafNodeCode) {
        this.innerNodeCode = innerNodeCode;
        this.leafNodeCode = leafNodeCode;
    }

    public static PublicSuffixType fromCode(char code) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.getInnerNodeCode() == code || publicSuffixType.getLeafNodeCode() == code) {
                return publicSuffixType;
            }
        }
        throw new IllegalArgumentException("No enum corresponding to given code: " + code);
    }

    public char getInnerNodeCode() {
        return this.innerNodeCode;
    }

    public char getLeafNodeCode() {
        return this.leafNodeCode;
    }
}
