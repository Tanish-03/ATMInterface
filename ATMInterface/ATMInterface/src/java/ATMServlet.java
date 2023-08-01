import java.io.*;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.*;
import javax.servlet.http.*;

public class ATMServlet extends HttpServlet {
  /*  private static int balance = 1000; // Initial account balance

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action != null) {
            switch (action) {
                case "withdraw":
                    int withdrawAmount = Integer.parseInt(request.getParameter("amount"));
                    withdraw(withdrawAmount, response);
                    break;
                case "deposit":
                    int depositAmount = Integer.parseInt(request.getParameter("amount"));
                    deposit(depositAmount, response);
                    break;
                case "transfer":
                    int transferAmount = Integer.parseInt(request.getParameter("amount"));
                    String targetAccount = request.getParameter("account");
                    transfer(transferAmount, targetAccount, response);
                    break;
                case "quit":
                    quit(response);
                    break;
                default:
                    response.getWriter().write("Invalid action.");
            }
        }
    }

    private void withdraw(int amount, HttpServletResponse response) throws IOException {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            response.getWriter().write("Withdrawn " + amount + ". New balance: " + balance);
        } else {
            response.getWriter().write("Invalid withdrawal amount.");
        }
    }

    private void deposit(int amount, HttpServletResponse response) throws IOException {
        if (amount > 0) {
            balance += amount;
            response.getWriter().write("Deposited " + amount + ". New balance: " + balance);
        } else {
            response.getWriter().write("Invalid deposit amount.");
        }
    }

    private void transfer(int amount, String targetAccount, HttpServletResponse response) throws IOException {
        // Logic to transfer amount to the target account (not implemented in this demo)
        response.getWriter().write("Transferred " + amount + " to account " + targetAccount + ".");
    }

    private void quit(HttpServletResponse response) throws IOException {
        response.getWriter().write("Thank you for using the ATM. Goodbye!");
    }*/
    // ... (existing code)

private static final List<String> transactionsHistory = new ArrayList<>();

@Override
protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String action = request.getParameter("action");

    if (action != null) {
        switch (action) {
            case "withdraw":
                // Withdraw logic (existing code)
                break;
            case "deposit":
                // Deposit logic (existing code)
                break;
            case "transfer":
                // Transfer logic (existing code)
                break;
            case "quit":
                // Quit logic (existing code)
                break;
            case "transactions":
                showTransactions(response);
                break;
            default:
                response.getWriter().write("Invalid action.");
        }
    }
}

private void showTransactions(HttpServletResponse response) throws IOException {
    if (transactionsHistory.isEmpty()) {
        response.getWriter().write("No transactions yet.");
    } else {
        StringBuilder sb = new StringBuilder();
        for (String transaction : transactionsHistory) {
            sb.append(transaction).append("<br>");
        }
        response.getWriter().write(sb.toString());
    }
}

protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    String action = request.getParameter("action");

    if (action != null) {
        switch (action) {
            case "withdraw":
                // Withdraw logic (existing code)
                break;
            case "deposit":
                // Deposit logic (existing code)
                break;
            case "transfer":
                // Transfer logic (existing code)
                break;
            case "quit":
                // Quit logic (existing code)
                break;
            case "addTransaction":
                String transaction = request.getParameter("transaction");
                addTransaction(transaction);
                break;
            default:
                response.getWriter().write("Invalid action.");
        }
    }
}

private void addTransaction(String transaction) {
    transactionsHistory.add(transaction);
}



}
