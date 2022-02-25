package ss8_clean_code_va_refactoring.bai_tap;

import static ss8_clean_code_va_refactoring.bai_tap.KataTennisGame.getScore;

public class KataTennisGame {
    public static final int LOVE = 0;
    public static final int FIFTEEN = 1;
    public static final int THIRTY = 2;
    public static final int FORTY = 3;

    public static String getScore(String playerName1, String playerName2, int playerScore1, int playerScore2) {
        String scoreResult = "";
        boolean isDeuce = playerScore1 == playerScore2;
        if (isDeuce) {
            if (playerScore1 < FORTY) {
                scoreResult = checkScore(playerScore1) + "-All";
            } else {
                scoreResult = checkScore(playerScore1);
            }
        } else if (playerScore1 >= FORTY || playerScore2 >= FORTY) {
            int minusResult = playerScore1 - playerScore2;
            scoreResult = checkWinnerOrAdvantage(minusResult);
        } else {
            scoreResult = checkScore(playerScore1) + "-" + checkScore(playerScore2);
        }
        return scoreResult;
    }

    private static String checkScore(int playerScore1) {
        String scoreResult;
        switch (playerScore1) {
            case LOVE:
                scoreResult = "Love";
                break;
            case FIFTEEN:
                scoreResult = "Fifteen";
                break;
            case THIRTY:
                scoreResult = "Thirty";
                break;
            case FORTY:
                scoreResult = "Forty";
                break;
            default:
                scoreResult = "Deuce";
                break;
        }
        return scoreResult;
    }

    private static String checkWinnerOrAdvantage(int minusResult) {
        String scoreResult;
        if (minusResult == 1) scoreResult = "Advantage player1";
        else if (minusResult == -1) scoreResult = "Advantage player2";
        else if (minusResult >= 2) scoreResult = "Win for player1";
        else scoreResult = "Win for player2";
        return scoreResult;
    }

    public static void main(String[] args) {
        System.out.println(getScore("Huy1", "Huy2", 1, 3));
    }
}


//    public static String getScore(String player1Name, String player2Name, int m_score1, int m_score2) {
//        String score = "";
//        int tempScore=0;
//        if (m_score1==m_score2)
//        {
//            switch (m_score1)
//            {
//                case 0:
//                    score = "Love-All";
//                    break;
//                case 1:
//                    score = "Fifteen-All";
//                    break;
//                case 2:
//                    score = "Thirty-All";
//                    break;
//                case 3:
//                    score = "Forty-All";
//                    break;
//                default:
//                    score = "Deuce";
//                    break;
//
//            }
//        }
//        else if (m_score1>=4 || m_score2>=4)
//        {
//            int minusResult = m_score1-m_score2;
//            if (minusResult==1) score ="Advantage player1";
//            else if (minusResult ==-1) score ="Advantage player2";
//            else if (minusResult>=2) score = "Win for player1";
//            else score ="Win for player2";
//        }
//        else
//        {
//            for (int i=1; i<3; i++)
//            {
//                if (i==1) tempScore = m_score1;
//                else { score+="-"; tempScore = m_score2;}
//                switch(tempScore)
//                {
//                    case 0:
//                        score+="Love";
//                        break;
//                    case 1:
//                        score+="Fifteen";
//                        break;
//                    case 2:
//                        score+="Thirty";
//                        break;
//                    case 3:
//                        score+="Forty";
//                        break;
//                }
//            }
//        }
//        return score;
//    }
//}
