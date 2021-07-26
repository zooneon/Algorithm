class NewIdRecommendation {
    public String solution(String new_id) {
        new_id = new_id.toLowerCase();
        String id = "";
        for (int i = 0; i < new_id.length(); i++) {
            if (new_id.charAt(i) >= 'a' && new_id.charAt(i) <= 'z') {
                id += new_id.charAt(i);
            }
            if (new_id.charAt(i) >= '0' && new_id.charAt(i) <= '9') {
                id += new_id.charAt(i);
            }
            if (new_id.charAt(i) == '-' || new_id.charAt(i) == '_' || new_id.charAt(i) == '.') {
                id += new_id.charAt(i);
            }
        }

        String recommendId = "";
        recommendId += id.charAt(0);
        for (int i = 1; i < id.length(); i++) {
            if (id.charAt(i - 1) == '.' && id.charAt(i) == '.') {
                continue;
            }
            recommendId += id.charAt(i);
        }

        if (recommendId.charAt(0) == '.') {
            recommendId = recommendId.substring(1);
        }
        if (recommendId.length() > 0 && recommendId.charAt(recommendId.length() - 1) == '.') {
            recommendId = recommendId.substring(0, recommendId.length() - 1);
        }

        if (recommendId.isEmpty()) {
            recommendId = "a";
        }

        if (recommendId.length() > 15) {
            recommendId = recommendId.substring(0, 15);
        }
        if (recommendId.charAt(0) == '.') {
            recommendId = recommendId.substring(1);
        }
        if (recommendId.charAt(recommendId.length() - 1) == '.') {
            recommendId = recommendId.substring(0, recommendId.length() - 1);
        }

        if (recommendId.length() <= 2) {
            while (recommendId.length() < 3) {
                recommendId += recommendId.charAt(recommendId.length() - 1);
            }
        }

        return recommendId;
    }
}
