package org.conscrypt.ct;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class VerifiedSCT {
    public final SignedCertificateTimestamp sct;
    public final Status status;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public enum Status {
        VALID,
        INVALID_SIGNATURE,
        UNKNOWN_LOG,
        INVALID_SCT
    }

    public VerifiedSCT(SignedCertificateTimestamp signedCertificateTimestamp, Status status) {
        this.sct = signedCertificateTimestamp;
        this.status = status;
    }
}
