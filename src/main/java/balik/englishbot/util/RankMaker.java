package balik.englishbot.util;

import balik.englishbot.bot.Messages;

public final class RankMaker {
    public static String determineRank(int guess, int total) {
        String rank = String.format(Messages.RANK.getMessage(), guess, total);
        if (total == 0) {
            return rank + Messages.NO_RANK.getMessage();
        }
        double percent = ((double) (guess * 100)) / total;
        if (percent >= 95.0d) {
            rank += Messages.RANK_A.getMessage();
        } else if (percent >= 90.0d && percent < 95.0d) {
            rank += Messages.RANK_B.getMessage();
        } else if (percent >= 75.0d && percent < 90.0d) {
            rank += Messages.RANK_C.getMessage();
        } else if (percent >= 60.0d && percent < 75.0d) {
            rank += Messages.RANK_D.getMessage();
        } else if (percent >= 40.0d && percent < 60.0d) {
            rank += Messages.RANK_E.getMessage();
        } else if (percent < 40.0d) {
            rank += Messages.RANK_F.getMessage();
        }

        return rank;
    }
}