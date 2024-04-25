package pkg.deepCurse.onslaught.common;

import javax.annotation.Nullable;

public class Util {

	public static class Result<O, E> {
		private boolean isOk;
		private O ok;
		private E err;

		private Result() {
			throw new IllegalAccessError();
		}

		public Result(boolean isOk, O ok, E err) {
			this.isOk = isOk;
			this.ok = ok;
			this.err = err;
		}

		public static <O, E> Result<O, E> ok(O ok) {
			return new Result<O, E>(true, ok, null);
		}

		public static <O, E> Result<O, E> err(E err) {
			return new Result<O, E>(false, null, err);
		}

		public boolean isOk() {
			return isOk;
		}

		public @Nullable O getOk() {
			return ok;
		}

		public @Nullable E getError() {
			return err;
		}

		public O unwrap() {
			if (isOk) {
				return ok;
			} else {
				throw new IllegalStateException("Failed to unwrap.");
			}
		}
	}

}
