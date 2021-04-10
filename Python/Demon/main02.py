from turtle import Turtle, Screen

tim = Turtle()
screen = Screen()


def move_forwards():
    tim.forward(10)

def move_backword():
    tim.backward(10)

def turn_left():
    tim.left(90)

def turn_right():
    tim.right(90)


screen.listen()
screen.onkey(key="w", fun= move_forwards)
screen.onkey(key="s", fun= move_backword)
screen.onkey(key="a", fun= turn_left)
screen.onkey(key="d", fun= turn_right)

screen.exitonclick()