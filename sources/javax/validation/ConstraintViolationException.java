package javax.validation;

import java.util.HashSet;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class ConstraintViolationException extends ValidationException {
    private final Set<ConstraintViolation<?>> constraintViolations;

    public ConstraintViolationException(String str, Set<? extends ConstraintViolation<?>> set) {
        super(str);
        if (set == null) {
            this.constraintViolations = null;
        } else {
            this.constraintViolations = new HashSet(set);
        }
    }

    public Set<ConstraintViolation<?>> getConstraintViolations() {
        return this.constraintViolations;
    }

    public ConstraintViolationException(Set<? extends ConstraintViolation<?>> set) {
        this(null, set);
    }
}
