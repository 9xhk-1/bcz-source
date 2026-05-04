package com.google.zxing;

import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface j {
    k a(b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    k c(b bVar) throws NotFoundException, ChecksumException, FormatException;

    void reset();
}
