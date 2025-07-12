# 🎰 Slot Machine Game - Java Console Application

Welcome to the **Slot Machine Casino!**  
This is a simple Java console game that simulates a slot machine. The player starts with ₹100 and can place bets to spin a 3-symbol slot. Match symbols to win rewards!

---

## 🕹️ How to Play

1. You'll start with ₹100 balance.
2. Enter a bet amount.
3. The slot machine spins and shows 3 random symbols.
4. Matching symbols reward you based on the payout table.
5. After each spin, you’ll be asked if you want to play again (`Y`/`N`).
6. Game ends when:
   - You choose not to play again, or
   - Your balance becomes ₹0.

---

## 🎯 Game Symbols and Payouts

| Symbols Match       | Reward (Multiplier of Bet) |
|---------------------|-----------------------------|
| 🍒 🍒 🍒             | 3× bet                     |
| 🍉 🍉 🍉             | 4× bet                     |
| 🍋 🍋 🍋             | 5× bet                     |
| 🔔 🔔 🔔             | 10× bet                    |
| ⭐ ⭐ ⭐              | 20× bet                    |
| Any 2 matching 🍒   | 2× bet                     |
| Any 2 matching 🍉   | 3× bet                     |
| Any 2 matching 🍋   | 4× bet                     |
| Any 2 matching 🔔   | 5× bet                     |
| Any 2 matching ⭐    | 10× bet                    |

---


## 🧾 Example Output

```text
***************************************************************
Welcome to slot machine casino! It's your Lucky Day!
symbols: 🍒 🍉 🍋 🔔 ⭐
***************************************************************
your balance amount is ₹100.0
Enter your bet amount: 10
spinning......
*************
🍒 | 🍒 | 🍒
*************
Congratulations, You won ₹.30
Do you want to Play Again(Y/N): Y
```


Beginner-friendly Java project to understand loops, conditionals, arrays, and randomization.

📌 Notes
Input validation ensures correct bet amount and play-again choice.

Game uses Random for slot outcomes and String[] for symbols.

Happy spinning! 🎰
