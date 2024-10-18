
// public class Team {
//     private String name;
//     private int score;

//     public Team(String name, int score) {
//         this.name = name;
//         this.score = score;
//     }

//     public String getName() {
//         return name;
//     }

//     public int getScore() {
//         return score;
//     }
// }
// public class Ipl{
//     public static void main(String[] args) {
//         List<Team> teams = new ArrayList<>();
//         Scanner scanner = new Scanner(System.in);
//         String input;

//         System.out.println("IPL Scoreboard");
//         System.out.println("Enter team name and score (e.g., Team A 150). Type 'exit' to finish.");

//         while (true) {
//             System.out.print("Enter team details: ");
//             input = scanner.nextLine();

//             if (input.equalsIgnoreCase("exit")) {
//                 break;
//             }

//             String[] parts = input.split(" ");
//             if (parts.length != 8) {
//                 System.out.println("Invalid input. Please enter team name and score.");
//                 continue;
//             }

//             String teamName = parts[0];
//             int score = Integer.parseInt(parts[1]);
//             teams.add(new Team(teamName, score));
//         }

//         displayScoreboard(teams);
//         scanner.close();
//     }

//     private static void displayScoreboard(List<Team> teams) {
//         System.out.println("\nIPL Scoreboard:");
//         System.out.println("--------------------------------");
//         System.out.printf("%-20s %-10s%n", "Team", "Score");
//         System.out.println("--------------------------------");

//         for (Team team : teams) {
//             System.out.printf("%-20s %-10d%n", team.getName(), team.getScore());
//         }
//     }
// }



