<%@ Page Title="Home Page" Language="C#" MasterPageFile="~/Site.master" AutoEventWireup="true"
    CodeFile="Default.aspx.cs" Inherits="_Default" %>

<asp:Content ID="HeaderContent" runat="server" ContentPlaceHolderID="HeadContent">
</asp:Content>
<asp:Content ID="BodyContent" runat="server" ContentPlaceHolderID="MainContent">
    <h2>
        Welcome to Game Zone!!
    </h2>

    <script type="text/javascript">
        var game = function () {
            var userChoice = prompt("Do you choose rock, paper or scissors?");
            document.getElementById('lbuser').innerText = userChoice;
            console.log("userChoice" + userChoice);
            if (userChoice !== "rock") {
                if (userChoice !== "paper") {
                    if (userChoice !== "scissors") {
                        alert("Invalid Choice!!");
                        userChoice = prompt("Do you choose rock, paper or scissors?");
                        console.log("userChoice" + userChoice);
                    }
                }
            }
            var computerChoice = Math.random();

            if (computerChoice < 0.34) {
                computerChoice = "rock";
            } else if (computerChoice <= 0.67) {
                computerChoice = "paper";
            } else {
                computerChoice = "scissors";
            }
            document.getElementById('lbComputer').innerText = computerChoice;
            
            var result = compare(userChoice, computerChoice);
            document.getElementById("lbResult").innerText = result;
        };


        var compare = function (choice1, choice2) {
            if (choice1 === choice2) {
                return "The result is a tie!";
            }
            else if (choice1 === "rock") {
                if (choice2 === "scissors") {
                    return "rock Wins";
                }
                else {
                    return "paper wins";
                }
            }
            else if (choice1 === "rock") {
                if (choice2 === "paper") {
                    return "paper Wins";
                }
                else {
                    return "rock wins";
                }
            }
            else if (choice1 === "scissors") {
                if (choice2 === "rock") {
                    return "rock wins";
                }
                else {
                    return "scissors wins";
                }
            }
            else if (choice1 === "scissors") {
                if (choice2 === "paper") {
                    return "scissors wins";
                }
                else {
                    return "Paper wins";
                }
            }
            else if (choice1 === "paper") {
                if (choice2 === "rock") {
                    return "paper wins";
                }
                else {
                    return "rock wins";
                }
            }
            else if (choice1 === "paper") {
                if (choice2 === "scissors") {
                    return "scissors wins";
                }
                else {
                    return "paper wins";
                }
            }
        };
        
        
    </script>

    <h2>Rock - Paper - Scisssor</h2>
    <input type="button" value="Start" class="button" onclick ="game();" /><br />
   <p> <b>Your Choice:</b><label id="lbuser" value="" /><br /></p>
   <p><b>Computer Choice:</b> <label id="lbComputer" value="" /><br /></p>
   <b> <label id="lbResult" /></b>

    
</asp:Content>
