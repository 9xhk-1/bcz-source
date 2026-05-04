package org.conscrypt.ct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.ct.VerifiedSCT;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class CTVerificationResult {
    private final ArrayList<VerifiedSCT> validSCTs = new ArrayList<>();
    private final ArrayList<VerifiedSCT> invalidSCTs = new ArrayList<>();

    public void add(VerifiedSCT verifiedSCT) {
        if (verifiedSCT.status == VerifiedSCT.Status.VALID) {
            this.validSCTs.add(verifiedSCT);
        } else {
            this.invalidSCTs.add(verifiedSCT);
        }
    }

    public List<VerifiedSCT> getInvalidSCTs() {
        return Collections.unmodifiableList(this.invalidSCTs);
    }

    public List<VerifiedSCT> getValidSCTs() {
        return Collections.unmodifiableList(this.validSCTs);
    }
}
