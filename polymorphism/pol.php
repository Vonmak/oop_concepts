<?php

class Shape
{
    public function draw()
    {
        echo "This is a shape";
    }
}

class Circle extends Shape
{
    public function draw()
    {
        echo "This is a circle";
    }
}

class Calculator
{
    public function add(...$args)
    {
        return array_sum($args);
    }
}


$circle = new Circle();
$s = new Calculator;

$circle->draw();
echo "\n";

echo ($s->add(2, 4));
echo "\n";

echo ($s->add(8, 2));
