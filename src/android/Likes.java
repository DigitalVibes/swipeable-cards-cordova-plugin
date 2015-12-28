package com.digitalvibes.swipeCards.model;

public class Likes {
	 public enum Like {
	        None(0), Liked(1), Disliked(2);

	        public final int value;

	        private Like(int value) {
	            this.value = value;
	        }

	        public static Like fromValue(int value) {
	            for (Like style : Like.values()) {
	                if (style.value == value) {
	                    return style;
	                }
	            }
	            return null;
	        }
	    }
}
