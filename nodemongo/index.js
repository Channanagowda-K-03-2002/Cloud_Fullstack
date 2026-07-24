require('dotenv').config()
const express = require('express')
const connectDB = require('./db')
const bodyParser = require('body-parser')
const { Quiz } = require('./models/quiz')

const app = express()
const port = process.env.PORT

app.use(express.json());
app.use(bodyParser.urlencoded({ extended: true }));

connectDB().then(() => {
    console.log('Database connection established');
}).catch((err) => {
    console.error('Database connection error:', err);
});

app.get('/getAllQuizzes', async (req, res) => {
    Quiz.find().then(quizzes => {
        res.json(quizzes);
    });
});

app.get('/getRequiredQuiz/:id', async (req,res)=>{
    try{
    const quiz = await Quiz.findById(req.params.id);
     if (!quiz) return res.status(404).send('Quiz not found')

    res.json(quiz) }
     catch(err){
    res.status(500).send(err.message);
  }
});
app.post('/createQuiz', async (req, res) => {
    const { title, description } = req.body;
    const newQuiz = new Quiz({
        title,
        description,
    });

    newQuiz.save().then(savedQuiz => {
        res.json(savedQuiz);
    }).catch(err => {
        res.status(500).json({ error: 'Failed to create quiz' });
    });
});


app.listen(port, () => console.log(`Example app listening on port ${port}!`))